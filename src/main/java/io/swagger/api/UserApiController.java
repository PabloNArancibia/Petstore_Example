package io.swagger.api;

import io.swagger.model.ModelApiResponse;
import io.swagger.model.PetsResponse;
import io.swagger.model.RegisterRequest;
import io.swagger.model.RegisterResponse;
import io.swagger.model.User;
import io.swagger.model.UsersResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-06-30T04:00:03.965Z[GMT]")
@RestController
public class UserApiController implements UserApi {

    private static final Logger log = LoggerFactory.getLogger(UserApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public UserApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<RegisterResponse> addUser(@Parameter(in = ParameterIn.DEFAULT, description = "Adds an user", required=true, schema=@Schema()) @Valid @RequestBody RegisterRequest body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<RegisterResponse>(objectMapper.readValue("{\n  \"message\" : \"Sussssss\"\n}", RegisterResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<RegisterResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<RegisterResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<PetsResponse> listPetUser(@Parameter(in = ParameterIn.PATH, description = "Users ID List of pets", required=true, schema=@Schema()) @PathVariable("idUser") String idUser) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<PetsResponse>(objectMapper.readValue("{\n  \"pets\" : [ {\n    \"name\" : \"Canelita\",\n    \"id\" : 0,\n    \"category\" : \"Cat\",\n    \"status\" : \"life\"\n  }, {\n    \"name\" : \"Canelita\",\n    \"id\" : 0,\n    \"category\" : \"Cat\",\n    \"status\" : \"life\"\n  } ]\n}", PetsResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<PetsResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<PetsResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<UsersResponse> listUser() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<UsersResponse>(objectMapper.readValue("{\n  \"users\" : [ {\n    \"birthday\" : \"dd/mm/yy\",\n    \"password\" : \"pass1234\",\n    \"role\" : \"administrador\",\n    \"mail\" : \"mail@m.com\",\n    \"username\" : \"user1234\"\n  }, {\n    \"birthday\" : \"dd/mm/yy\",\n    \"password\" : \"pass1234\",\n    \"role\" : \"administrador\",\n    \"mail\" : \"mail@m.com\",\n    \"username\" : \"user1234\"\n  } ]\n}", UsersResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<UsersResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<UsersResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> updateUser(@Parameter(in = ParameterIn.DEFAULT, description = "User object that needs to be modify", required=true, schema=@Schema()) @Valid @RequestBody User body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
