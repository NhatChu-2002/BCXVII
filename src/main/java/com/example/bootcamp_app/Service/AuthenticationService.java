package com.example.bootcamp_app.Service;

import com.example.bootcamp_app.Entity.User;
import com.example.bootcamp_app.dto.AuthenticationRequest;
import com.example.bootcamp_app.dto.AuthenticationResponse;
import com.example.bootcamp_app.dto.RegisterRequest;
import com.example.bootcamp_app.dto.UserAlreadyExistsException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.coyote.BadRequestException;

import java.io.IOException;

public interface AuthenticationService {
    AuthenticationResponse register(RegisterRequest request) throws UserAlreadyExistsException;

    AuthenticationResponse authenticate(AuthenticationRequest request);

    void saveUserToken(User user, String jwtToken);

    void revokeAllUserTokens(User user);

    void refreshToken(
            HttpServletRequest request,
            HttpServletResponse response
    ) throws IOException;
}
