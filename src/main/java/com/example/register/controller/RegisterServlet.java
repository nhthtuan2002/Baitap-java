package com.example.register.controller;

import com.example.register.entity.Account;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;

public class RegisterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/User/register.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html; charset=ULT-8");
        resp.setCharacterEncoding("UTF-8");
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String confirmPassword = req.getParameter("confirmPassword");
        String fullName = req.getParameter("fullName");
        String email = req.getParameter("email");
        String phone = req.getParameter("phone");
        String birthday = req.getParameter("birthday");
        LocalDate date = LocalDate.parse(birthday);
        Account account = new Account();
        account.setUsername(username);
        account.setPassword(password);
        account.setFullName(fullName);
        account.setEmail(email);
        account.setPhone(phone);
        account.setBirthday(birthday);
        req.setAttribute("account", account);
        req.getRequestDispatcher("User/register-success.jsp").forward(req, resp);
    }
}
