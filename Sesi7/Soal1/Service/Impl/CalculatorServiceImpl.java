package service. impl;

import service.CalculatorService;

public class CalculatorServivceImpl implements CalculatorService{

	
	@Override
	public Integer tambah(int bil1. int bil2) {
		return bil1 + bil2;
	}
	
	@Override
	public Integer kurang(int bil1, int bil2) {
		return bil1 - bil2;
	}
	
	@Override
	public Integer kali(bil1, int bil2) {
		return bil1 * bil2;
	}
	
	@Override
	public integer bagi(int bil1, int bil2) {
		return bil1 / bil2;
	}
}