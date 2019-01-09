package pathVariable;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PathVariableController {

	@RequestMapping(value = "data")
	public ResponseEntity<Object> getDataList() {
		return new ResponseEntity<Object>(Database.dataEntities, HttpStatus.OK);
	}
	
	@RequestMapping(value = "data/{id}")
	public ResponseEntity<Object> getData(@PathVariable("id") int id) {
		return new ResponseEntity<Object>(Database.dataEntities.get(id), HttpStatus.OK);
	}
}
