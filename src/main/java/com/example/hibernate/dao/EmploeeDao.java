package com.example.hibernate.dao;


import com.example.hibernate.model.Emploee;

import java.util.List;

public interface EmploeeDao {
    void addEmploee(Emploee emploee);

    Emploee findById(int id);

    List<Emploee> getAllEmploee();

    void updateEmploee(int id,Emploee emploee);

    void deleteEmploeeById(int id,Emploee emploee);
}
