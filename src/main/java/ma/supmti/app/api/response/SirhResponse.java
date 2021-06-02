package ma.supmti.app.api.response;

import org.springframework.http.HttpStatus;

public class SirhResponse extends org.springframework.http.ResponseEntity<Object> {

		public SirhResponse(HttpStatus status) {
			super(status);
			// TODO Auto-generated constructor stub
		}

		public SirhResponse(Object body, int scOk) {
			super(body, null, scOk);
		}

}
