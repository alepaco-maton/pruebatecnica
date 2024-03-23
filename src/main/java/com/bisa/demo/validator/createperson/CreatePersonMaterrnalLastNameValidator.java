/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bisa.demo.validator.createperson;

import com.bisa.demo.validator.*;
import com.bisa.demo.commons.AppTools;
import com.bisa.demo.dto.CreatePersonRequest;
import com.bisa.demo.exception.ErrorCode;

/**
 *
 * @author alepaco.com
 */
public class CreatePersonMaterrnalLastNameValidator implements ICreatePersonValidator {

    public static final int MATERNAL_LAST_NAME_LENGTH_MIN = 1;
    public static final int MATERNAL_LAST_NAME_LENGTH_MAX = 100;

    @Override
    public ErrorCode validate(CreatePersonRequest request) {
        if (AppTools.isBlank(request.getMaternalLastName())) {
            return ErrorCode.CREATE_PERSON_MATERNAL_LAST_NAME_IS_REQUIRED;
        }

        if (!AppTools.isTheLengthOfTheStringValid(request.getMaternalLastName(),
                MATERNAL_LAST_NAME_LENGTH_MIN, MATERNAL_LAST_NAME_LENGTH_MAX)) {
            return ErrorCode.CREATE_PERSON_MATERNAL_LAST_NAME_IS_INVALID;
        }

        return ErrorCode.SUCCESSFUL;
    }

}
