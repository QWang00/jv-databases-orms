package org.northcoders;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.northcoders.entity.*;
import org.northcoders.entity.Tag;
import static java.lang.Boolean.TRUE;
import static org.hibernate.cfg.JdbcSettings.*;

public class Database {
    private static SessionFactory sessionFactory;
    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            try {
                Configuration configuration = new Configuration()
                        // Use H2 in-memory database
                        .setProperty(URL, "jdbc:h2:mem:db1")
                        // Default username / password
                        .setProperty(USER, "qiuqiu")
                        .setProperty(PASS, "")
                        // Options to display SQL in console
                        .setProperty(SHOW_SQL, TRUE.toString())
                        .setProperty(FORMAT_SQL, TRUE.toString())
                        .setProperty(HIGHLIGHT_SQL, TRUE.toString())
                        .setProperty("hibernate.agroal.maxSize", "20");

                // Try to add annotated classes
                try {
                    configuration.addAnnotatedClass(Tag.class);
                    configuration.addAnnotatedClass(Category.class);
                    configuration.addAnnotatedClass(Comment.class);
                    configuration.addAnnotatedClass(Image.class);
                    configuration.addAnnotatedClass(Ingredient.class);
                    configuration.addAnnotatedClass(Rating.class);
                    configuration.addAnnotatedClass(Recipe.class);
                    configuration.addAnnotatedClass(RecipeUser.class);
                } catch (Exception e) {

                    System.err.println("Failed to add annotated class: " + e.getMessage());
                    e.printStackTrace();
                    throw new RuntimeException("Error while adding annotated classes.", e);
                }


                sessionFactory = configuration.buildSessionFactory();
            } catch (Exception e) {

                System.err.println("SessionFactory creation failed: " + e.getMessage());
                e.printStackTrace();
                throw new RuntimeException("There was an error building the SessionFactory.", e);
            }
        }
        return sessionFactory;
    }
}