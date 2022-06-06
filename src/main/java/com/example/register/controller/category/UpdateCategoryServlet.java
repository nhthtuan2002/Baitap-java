package com.example.register.controller.category;

import com.example.register.entity.Category;
import com.example.register.model.CategoryModel;
import com.example.register.model.MySqlCategoryModel;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Locale;

public class UpdateCategoryServlet extends HttpServlet {
    private CategoryModel categoryModel;

    public UpdateCategoryServlet() {
        this.categoryModel = new MySqlCategoryModel();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            int id = Integer.parseInt(req.getParameter("id"));
            Category category = categoryModel.findById(id);
            if (category == null) {
                req.setAttribute("message", "Product is not found!");
                req.getRequestDispatcher("/admin/error/404.jsp");
                return;
            }
            req.setAttribute("categories", category);
            req.setAttribute("action", 2);
            req.getRequestDispatcher("/admin/categories/form.jsp").forward(req, resp);
        } catch (Exception e) {
            e.printStackTrace();
            req.setAttribute("message", e.getMessage());
            req.getRequestDispatcher("/admin/error/500.jsp");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            req.setCharacterEncoding("UTF-8");
            resp.setContentType("text/html; charset=UTF-8");
            resp.setCharacterEncoding("UTF-8");
            String name = req.getParameter("name");
            int id = Integer.parseInt(req.getParameter("id"));
            Category category = categoryModel.findById(id);
            category = Category.CategoryBuilder.aCategory()
                    .withName(name)
                    .build();
            if (category.isValid()) {
                boolean result = categoryModel.update(id, category);
                if (result) {
                    resp.sendRedirect("/admin/categories/list");
                } else {
                    throw new Exception("Can't update category");
                }
            } else {
                req.setAttribute("action", 2);
                req.setAttribute("errors", category.getErrors());
                req.setAttribute("categories", categoryModel.findAll());
                req.setAttribute("categories", category);
                req.getRequestDispatcher("/admin/categories/form.jsp").forward(req, resp);
            }
        } catch (Exception e) {
            e.printStackTrace();
            req.setAttribute("message", e.getMessage());
            req.getRequestDispatcher("/admin/error/500.jsp").forward(req, resp);
        }
    }
}
