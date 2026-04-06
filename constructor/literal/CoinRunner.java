class CoinRunner{
	public static void main(String[] args){
		Coin coin1= new Coin(100,"gold");
		coin1.info();
		
		CoinRun runner = new CoinRun();
		runner.CoinRun(coin1);
		
		runner.CoinRun(null);
	}
}