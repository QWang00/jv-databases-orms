package org.northcoders;

import org.hibernate.SessionFactory;
import org.hibernate.relational.SchemaManager;

public class Main {
    public static void main(String[] args) {
        SessionFactory sessionFactory = Database.getSessionFactory();
        SchemaManager schemaManager = sessionFactory.getSchemaManager();
        schemaManager.exportMappedObjects(true);

    }
}