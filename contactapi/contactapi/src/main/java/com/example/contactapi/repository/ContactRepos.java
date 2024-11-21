package com.example.contactapi.repository;

import com.example.contactapi.domain.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ContactRepos extends JpaRepository<Contact, String> {
    Optional<Contact> findById(String id);
}
