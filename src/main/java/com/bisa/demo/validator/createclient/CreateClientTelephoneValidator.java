/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bisa.demo.validator.createclient;

import com.bisa.demo.commons.AppTools;
import com.bisa.demo.dto.CreateClientRequest;
import com.bisa.demo.exception.ErrorCode;
import com.bisa.demo.validator.IValidator;

/**
 *
 * @author alepaco.com
 */
public class CreateClientTelephoneValidator implements IValidator<CreateClientRequest> {
        
    @Override
    public ErrorCode validate(CreateClientRequest request) {
        if (AppTools.isBlank(request.getTelephone())) {
            return ErrorCode.CREATE_CLIENT_TELEPHONE_IS_REQUIRED;
        }
 
        return ErrorCode.SUCCESSFUL;
    }
    
}
