package com.fictophone.services.records.rest;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fictophone.services.records.views.CallRecordView;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;
import com.wordnik.swagger.annotations.ApiResponse;
import com.wordnik.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/api/v1/call-records")
public class CallRecordsController {

	@ApiOperation("Create a call record")
    @ApiResponses({
            @ApiResponse(code = 200, message = "Call record successfully created"),
            @ApiResponse(code = 500, message = "Internal server error")
    })
	@RequestMapping(name="/records", method = RequestMethod.POST)
	public void addRecord(@ApiParam("The call record to store") @RequestBody CallRecordView record) {
		
	}
}
