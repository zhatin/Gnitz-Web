package io.gnitz.example.jwt;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class JwtTests {

    @Test
    void jwtGenerateTest() {
        JwtTokenUtil jwtTokenUtil = new JwtTokenUtil();
        jwtTokenUtil.setSecret("This!Is@JWT#Secret$Password%String^");
        String token = jwtTokenUtil.generateToken("admin");
        String userName = jwtTokenUtil.getUsernameFromToken(token);
        assertEquals(userName, "admin");
        // String expired = jwtTokenUtil.getExpirationDateFromToken(token).toString();
        // String issuer = jwtTokenUtil.getIssuedAtDateFromToken(token).toString();
    }
}