package com.example.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.models.Item;
import com.example.models.Person;
import com.example.repositories.ItemRepository;


@Service
@Transactional(readOnly = true)
public class ItemService {
    private final ItemRepository itemRepository;

    @Autowired
    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public List<Item> findByItemName(String itemName) {
        return itemRepository.findByItemName(itemName);

    }

    public List<Item> findByOwner(Person owner) {
        return itemRepository.findByOwner(owner);

    }



    

    
}
