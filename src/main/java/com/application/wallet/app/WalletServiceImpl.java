package com.application.wallet.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Service
public class WalletServiceImpl implements WalletService{
    @Autowired
     private WalletRepository walletRepository;
    WalletDto walletDto;
    @Override
    public WalletDto registerWallet(WalletDto walletDto) throws WalletException {
        return walletRepository.saveWallet(walletDto);
    }

    @Override
    public Double addFundsToWalletById(Integer walletId, Double amount) throws WalletException {
        Double balance=walletDto.getBalance();
        balance  =balance+amount;
        walletRepository.updateWallet(walletDto);
        return walletDto.getBalance();
    }

    @Override
    public Double withdrawByWalletId(Integer walletId, Double amount) throws WalletException {
        Double balance=walletDto.getBalance();
        balance  =balance-amount;
        walletRepository.updateWallet(walletDto);
        return walletDto.getBalance();
    }

    @Override
    public Boolean fundTransfer(Integer fromWalletId, Integer toWalletId, Double amount) throws WalletException {
        return null;
    }

    @Override
    public WalletDto deleteWalletById(Integer walletId) throws WalletException {
        return null;
    }

    @Override
    public WalletDto getWalletById(Integer walletId) throws WalletException {
        return null;
    }

    @Override
    public WalletDto updateWallet(Integer walletId) throws WalletException {
        return walletRepository.updateWallet(walletDto);
    }
}
