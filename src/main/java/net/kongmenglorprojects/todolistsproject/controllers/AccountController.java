package net.kongmenglorprojects.todolistsproject.controllers;
import net.kongmenglorprojects.todolistsproject.dto.addListDTO;
import net.kongmenglorprojects.todolistsproject.dto.createDTO;
import net.kongmenglorprojects.todolistsproject.dto.socialMediaDTO;
import net.kongmenglorprojects.todolistsproject.entities.AccountEntity;
import net.kongmenglorprojects.todolistsproject.entities.ListsEntity;
import net.kongmenglorprojects.todolistsproject.entities.SocialMediaEntity;
import org.springframework.web.bind.annotation.*;
import net.kongmenglorprojects.todolistsproject.services.AccountService;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/account")
public class AccountController {
    AccountService accountService;
    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }
    @PostMapping
    public AccountEntity createAccount(@RequestBody createDTO dto) {
        return this.accountService.createAccount(dto);
    }
    @GetMapping
    public AccountEntity login(@RequestParam String email, @RequestParam String password) {
        return this.accountService.login(email,password);
    }

    @PostMapping("/addTask")
    public List<ListsEntity> addTask(@RequestBody addListDTO dto) {
        return this.accountService.addTask(dto);
    }
    @PostMapping("/addSocialMedia")
    public List<SocialMediaEntity> addSocialMedia(@RequestBody socialMediaDTO dto) {
        return this.accountService.addSocialMedia(dto);
    }

}
