package com.generation.model;

import java.util.Date;
//only purpose is inheritance. do not do anything to this file
abstract public class Person
{
    private final String id;
    private final String name;
    private final String email;
    private final Date birthDate;

    protected Person( String id, String name, String email, Date birthDate )
    {
        this.id = id;
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
    }

    public String getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public String getEmail()
    {
        return email;
    }

    public Date getBirthDate()
    {
        return birthDate;
    }


    @Override
    public String toString()
    {
        return id + '\'' + ", name='" + name + '\'' + ", email='" + email + '\'' + ", birthDate=" + birthDate;
    }
}
