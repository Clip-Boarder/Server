package com.clipboarder.clipboarder.controller;

import com.clipboarder.clipboarder.entity.dto.ClipboarderUserDTO;
import com.clipboarder.clipboarder.service.ClipboarderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/user")
public class ClipboarderUserController {
    private final ClipboarderService clipboarderService;

    @PostMapping
    public void signUp(@RequestBody ClipboarderUserDTO clipboarderUserDTO){
        clipboarderService.register(clipboarderUserDTO);
    }

}
