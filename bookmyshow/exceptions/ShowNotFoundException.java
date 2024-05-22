package com.palash.bookmyshow.exceptions;

import com.palash.bookmyshow.models.Show;

public class ShowNotFoundException extends Exception{
    public ShowNotFoundException(String message){
        super(message);
    }
}
