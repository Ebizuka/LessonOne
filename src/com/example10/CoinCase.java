package com.example10;

public class CoinCase {private int    conin1 = 0;
private int    conin5 = 0;
private int    conin10 = 0;
private int    conin50 = 0;
private int    conin100 = 0;
private int    conin500 = 0;

public    void    AddCoins(int kind,int count){
    switch(kind){
    
    //�d�݂̎�ނ𔻕ʂ������𐔂���B
    case 1:
        conin1 += count;
        break;
    case 5:
        conin5 += count;
        break;
    case 10:
        conin10 += count;
        break;
    case 50:
        conin50 += count;
        break;
    case 100:
        conin100 += count;
        break;
    case 500:
        conin500 += count;
        break;
    default:
        break;
    }
}
public int GetCount(int kind){
    switch(kind){
    //�d�݂̎�ނɂ��ďo��
    case 1:
        return conin1;
    case 5:
        return conin5;
    case 10:
        return conin10;
    case 50:
        return conin50;
    case 100:
        return conin100;
    case 500:
        return conin500;
    default:
        return 0;
    }
}

public  int  GetCount(){
	//�^����ꂽ�R�C���̖������v�Z�H
    int total = 0;
    total += GetCount(1);
    total += GetCount(5);
    total += GetCount(10);
    total += GetCount(50);
    total += GetCount(100);
    total += GetCount(500);
    return total;
}

public int GetAmount(int kind) {
	// �d�݂̎�ނɑ΂��Ă̍��v
    return GetCount(kind)*kind;
}

public  int  GetAmount(){
	//�^����ꂽ�d�݂̑��z���v�Z
    int total = 0;
    total += GetAmount(1);
    total += GetAmount(5);
    total += GetAmount(10);
    total += GetAmount(50);
    total += GetAmount(100);
    total += GetAmount(500);
    return total;
}
}