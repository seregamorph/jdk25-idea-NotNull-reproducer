package org.example;

import org.testcontainers.containers.JdbcDatabaseContainer;

public class PgBouncerContainer extends JdbcDatabaseContainer<PgBouncerContainer> {

    public PgBouncerContainer() {
        super("string argument!");
//                super(DockerImageName.parse("postgres:12-alpine"));
    }

    @Override
    public String getDriverClassName() {
        throw new UnsupportedOperationException();
    }

    @Override
    public String getJdbcUrl() {
        throw new UnsupportedOperationException();
    }

    @Override
    public String getUsername() {
        throw new UnsupportedOperationException();
    }

    @Override
    public String getPassword() {
        throw new UnsupportedOperationException();
    }

    @Override
    protected String getTestQueryString() {
        throw new UnsupportedOperationException();
    }
}
