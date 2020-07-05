package com.revature.entities;

import java.io.Serializable;

public class JwtResponse implements Serializable {

    private static final long serialVersionUID = -8091879091924046844L;

    private final String jwttoken;
    int i; String string; String string2;

    public JwtResponse(String jwttoken, int i, String string, String string2) {

		this.jwttoken = jwttoken;
		this.i = i;
		this.string = string;
		this.string2 = string2;
	}

    public String getToken() {

        return this.jwttoken;

    }

}
