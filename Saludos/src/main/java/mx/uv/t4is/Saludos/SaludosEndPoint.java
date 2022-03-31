package mx.uv.t4is.Saludos;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import https.t4is_uv_mx.saludos.BuscarSaludosResponse;
import https.t4is_uv_mx.saludos.SaludarRequest;
import https.t4is_uv_mx.saludos.SaludarResponse;

@Endpoint
public class SaludosEndPoint{
	@PayloadRoot(localPart = "SaludarRequest",namespace = "https://t4is.uv.mx/saludos")
	@ResponsePayload 
	public SaludarResponse Saludar(@RequestPayload SaludarRequest peticion){
		SaludarResponse respuesta = new SaludarResponse();
		respuesta.setRespuesta("Hola " + peticion.getNombre());
		return respuesta; 
	}
	@PayloadRoot(localPart = "BuscarSaludarRequest",namespace = "https://t4is.uv.mx/saludos")
		public BuscarSaludosResponse buscarSaludos(){
			BuscarSaludosResponse respuesta = new BuscarSaludosResponse();
			return respuesta; 
		}
}