package com.application.wallet.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
//@RequestMapping
public class WalletController {
    @Autowired
    private WalletService walletService;
    

    @GetMapping("/wallet/{id}")
    public WalletDto getWalletById(@PathVariable Integer id) throws WalletException{
        return walletService.getWalletById(id);
    }
    @PostMapping("/wallet")
    public WalletDto addResource(@RequestBody WalletDto walletDto) throws WalletException {
        return walletService.registerWallet(walletDto);
    }
    @PutMapping("/wallet")
    public WalletDto replaceResource(@RequestBody WalletDto walletDto) throws WalletException {
        return walletService.updateWallet(walletDto.getWalletId());
    }
    @DeleteMapping("/wallet/{id}")
    public WalletDto deleteResource(@PathVariable Integer id) throws WalletException {
        return walletService.deleteWalletById(id);
    }
    @PatchMapping("/wallet/{id}/balance/{addFunds}")
    public String updateResource(@PathVariable Integer id, @PathVariable Double addFunds) throws WalletException {
        WalletDto walletDto=new WalletDto(1,"bavya",100.0);
        Double balance=walletService.addFundsToWalletById(id, addFunds);
        return "balance is"+balance;
    }




}
