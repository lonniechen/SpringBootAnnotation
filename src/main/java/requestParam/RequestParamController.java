package requestParam;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import pathVariable.Database;

@RestController
public class RequestParamController {

//	this will report error
//	@RequestMapping(value = "data")
//	public ResponseEntity<Object> getDataList() {
//		return new ResponseEntity<Object>(Database.dataEntities, HttpStatus.OK);
//	}

	@RequestMapping(value = "data")
	public ResponseEntity<Object> getDataList(
			@RequestParam(value = "id", required = false, defaultValue = "0") int id) {
		if (id == 0) {
			return new ResponseEntity<Object>(Database.dataEntities, HttpStatus.OK);
		} else {
			return new ResponseEntity<Object>(Database.dataEntities.get(id), HttpStatus.OK);
		}
	}
}
