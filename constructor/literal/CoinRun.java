class CoinRun {  
    void CoinRun(Coin coin) {
        if (coin != null) {      
            coin.info();
        } else {
            System.out.println("invalid");
        }
    }
}