package com.OneToOne;

import com.hibernate.dao.CitizenDao;
import com.hibernate.daoImpl.CitizenDaoImpl;

public class App 
{
    public static void main( String[] args )
    {
        CitizenDao dao=new CitizenDaoImpl();
        dao.addCitizen();
        dao.fetchCitizen();
    }
}
