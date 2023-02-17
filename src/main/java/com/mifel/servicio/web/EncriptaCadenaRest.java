package com.mifel.servicio.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mifel.servicio.model.CadenaEnc;
import com.mifel.servicio.model.CadenaEncSal;
import com.mifel.servicio.security.AESUtil;

@RestController
@RequestMapping("/rest/encriptaCadena")
public class EncriptaCadenaRest {

	
	@PostMapping
	public ResponseEntity<CadenaEncSal> cadenaRecepcion(@RequestBody final CadenaEnc cadenas){
		try {
		    String iv = "0123456789ABCDEF"; // vector de inicialización usado en iv
			CadenaEncSal cadEncSal = new CadenaEncSal();
			AESUtil aesUtil = new AESUtil();
			String cadEncript = cadenas.getCadena();
			String salida = aesUtil.encriptar(cadEncript, "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAqrGqY1JPVj/ctwXdu9vO\r\n"
					+ "97sxkfvPJFmsDXvV1opddfefrctYDTZeg7QsL2mH9D9HJ6zpNztg03IpkLSGAfsR\r\n"
					+ "dO2sJKYNM+DyOKDo/PrIblh1TgrvOnuba5uPmBeJL12i9COoUWdOY+7hbKkgZJ1C\r\n"
					+ "IEIMjFserqhF7hHoEpK9WtKtl9eTRKXHw3pt3AGppOL7kviUaIjShnkXi7kx51bu\r\n"
					+ "Aci/OSVqTBbQyeq9swGDnllF8ZOeMhty7v+k8LnZasOjiyZTWXqMu2CoypvldMWS\r\n"
					+ "kJ3fggC3AKMgpPrAIxFYAJSNtNEOgJdyTKGmWAm5Y1h50HWDb5bqYWJWn0ueJi3l\r\n"
					+ "OQIDAQAB", iv);
			String desencriptado = aesUtil.desencriptar(salida, "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAqrGqY1JPVj/ctwXdu9vO\r\n"
					+ "97sxkfvPJFmsDXvV1opddfefrctYDTZeg7QsL2mH9D9HJ6zpNztg03IpkLSGAfsR\r\n"
					+ "dO2sJKYNM+DyOKDo/PrIblh1TgrvOnuba5uPmBeJL12i9COoUWdOY+7hbKkgZJ1C\r\n"
					+ "IEIMjFserqhF7hHoEpK9WtKtl9eTRKXHw3pt3AGppOL7kviUaIjShnkXi7kx51bu\r\n"
					+ "Aci/OSVqTBbQyeq9swGDnllF8ZOeMhty7v+k8LnZasOjiyZTWXqMu2CoypvldMWS\r\n"
					+ "kJ3fggC3AKMgpPrAIxFYAJSNtNEOgJdyTKGmWAm5Y1h50HWDb5bqYWJWn0ueJi3l\r\n"
					+ "OQIDAQAB", iv);
			cadEncSal.setCadena(cadenas.getCadena());
			cadEncSal.setEncriptado(salida);
			cadEncSal.setDesencriptado(desencriptado);
			return new ResponseEntity<CadenaEncSal>(cadEncSal,null,HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<CadenaEncSal>(null,null,HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
  
}
