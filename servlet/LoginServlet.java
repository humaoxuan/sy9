package cs.cwnu.servlet;

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet ;
import javax.servlet.http.* ;
import cs.Cwnu.bean.User;
import cs.cwnu.dao.UserDao;
@WebServlet ("/loginServlet")
public class LoginServlet extends HttpServlet {
    public void doGet(HttpServletRequest request ,
                      HttpServletResponse response) throws ServletException,
            I0Exception {

        r eques t.setCharacterEncoding("gb2312" );1/设置请