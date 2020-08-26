package io.gnitz.example.jwt;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class JwtTests {

    @Test
    void jwtGenerateTest() {
        JwtTokenUtil jwtTokenUtil = new JwtTokenUtil();
        jwtTokenUtil.setSecret("This!Is@JWT#Secret$Password%String^");
        String token = jwtTokenUtil.generateToken("admin");
        assertTrue(jwtTokenUtil.validateToken(token, "admin"));
        assertTrue(jwtTokenUtil.canTokenBeRefreshed(token));
        assertEquals(jwtTokenUtil.getUsernameFromToken(token), "admin");
        assertNotNull(jwtTokenUtil.getExpirationDateFromToken(token).toString());
        assertNotNull(jwtTokenUtil.getIssuedAtDateFromToken(token).toString());
    }
}