package com.application.wallet.app;

public interface WalletService {
    WalletDto registerWallet(WalletDto walletDto) throws WalletException;
    Double addFundsToWalletById(Integer walletId,Double amount) throws WalletException;
    Double withdrawByWalletId(Integer walletId,Double amount) throws WalletException;
    Boolean fundTransfer(Integer fromWalletId,Integer toWalletId,Double amount) throws WalletException;
    WalletDto deleteWalletById(Integer walletId)throws WalletException;
    WalletDto getWalletById(Integer walletId)throws  WalletException;
    WalletDto updateWallet(Integer walletId)throws WalletException;

}
