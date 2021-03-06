/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.27).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.ModelApiResponse;
import io.swagger.model.PetsResponse;
import io.swagger.model.RegisterRequest;
import io.swagger.model.RegisterResponse;
import io.swagger.model.User;
import io.swagger.model.UsersResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.CookieValue;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-06-30T04:00:03.965Z[GMT]")
@Validated
public interface UserApi {

    @Operation(summary = "Add a user", description = "Add a user", tags={ "user" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(mediaType = "application/json", schema = @Schema(implementation = RegisterResponse.class))),
        
        @ApiResponse(responseCode = "500", description = "internal error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = RegisterResponse.class))) })
    @RequestMapping(value = "/user",
        produces = { "application/json" }, 
        consumes = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<RegisterResponse> addUser(@Parameter(in = ParameterIn.DEFAULT, description = "Adds an user", required=true, schema=@Schema()) @Valid @RequestBody RegisterRequest body);


    @Operation(summary = "List of pet from the user", description = "List of pet", tags={ "user" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(mediaType = "application/json", schema = @Schema(implementation = PetsResponse.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ModelApiResponse.class))) })
    @RequestMapping(value = "/user/{idUser}/pet",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<PetsResponse> listPetUser(@Parameter(in = ParameterIn.PATH, description = "Users ID List of pets", required=true, schema=@Schema()) @PathVariable("idUser") String idUser);


    @Operation(summary = "List All user in system", description = "List all users", tags={ "user" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UsersResponse.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ModelApiResponse.class))) })
    @RequestMapping(value = "/user/alluser",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<UsersResponse> listUser();


    @Operation(summary = "Update an existing User", description = "", tags={ "user" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
        
        @ApiResponse(responseCode = "404", description = "User not found"),
        
        @ApiResponse(responseCode = "405", description = "Validation exception") })
    @RequestMapping(value = "/user",
        consumes = { "application/json" }, 
        method = RequestMethod.PUT)
    ResponseEntity<Void> updateUser(@Parameter(in = ParameterIn.DEFAULT, description = "User object that needs to be modify", required=true, schema=@Schema()) @Valid @RequestBody User body);

}

