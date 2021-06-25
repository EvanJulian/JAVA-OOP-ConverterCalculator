public class ConvertCalculator{
    public static String coreConvertFromDecimal(int number, int radix){
        StringBuilder sb = new StringBuilder();
        if(radix == 2){
            boolean kondisi = true;
            int i = number;
            int counter = 0;
            int awal = 3;
            while(kondisi){
                if(i!=0){
                    if(i%2!=0){
                        if (counter==awal){
                            sb.append("1");
                            i = (i/radix);
                            sb.append(" ");
                        }
                        else if(counter==awal+4){
                            sb.append("1");
                            i = (i/radix);
                            sb.append(" ");
                            awal = awal+4;
                        }
                        else{
                            sb.append("1");
                            i = (i/radix);
                        }
                        counter +=1;
                    }
                    else{
                        if (counter==awal){
                            sb.append("0");
                            i = (i/radix);
                            sb.append(" ");
                        }
                        else if(counter==awal+4){
                            sb.append("0");
                            i = (i/radix);
                            sb.append(" ");
                            awal = awal+4;
                        }
                        else{
                            sb.append("0");
                            i = (i/radix);
                        }
                        counter +=1;
                    }
                }
                else{
                    kondisi = false;
                }
            }
            sb.reverse();
        }
        else if(radix == 8){
            boolean kondisi = true;
            int i = number;
            int counter = 0;
            int awal = 2;
            while(kondisi){
                if(i!=0){
                    if(i%radix!=0){
                        if(counter==awal){
                            int hasil = i/radix;
                            int sisa = i-(hasil*radix);
                            sb.append(sisa);
                            i = i/radix;
                            sb.append(" ");
                        }
                        else if(counter==awal+3){
                            int hasil = i/radix;
                            int sisa = i-(hasil*radix);
                            sb.append(sisa);
                            i = i/radix;
                            sb.append(" ");
                            awal = awal+3;
                        }
                        else{
                            int hasil = i/radix;
                            int sisa = i-(hasil*radix);
                            sb.append(sisa);
                            i = i/radix;
                        }
                        counter +=1;
                    }
                    else{
                        if(counter==awal){
                            sb.append("0");
                            i = i/radix;
                            sb.append(" ");
                        }
                        else if(counter==awal+3){
                            sb.append("0");
                            i = i/radix;
                            sb.append(" ");
                            awal = awal+3;
                        }
                        else{
                            sb.append("0");
                            i = i/radix;
                        }
                        counter +=1;
                    }
                }
                else{
                    kondisi = false;
                }
            }
            sb.reverse();
        }
        else if (radix==16){
            boolean kondisi = true;
            int i = number;
            int counter = 0;
            int awal = 3;
            while(kondisi){
                if(i!=0){
                    if(i%radix>0){
                        if (counter==awal){
                            int hasil = i/radix;
                            int sisa = i-(hasil*radix);
                            if(sisa==10){
                                sb.append("A");
                            }
                            else if(sisa==11){
                                sb.append("B");
                            }
                            else if(sisa==12){
                                sb.append("C");
                            }
                            else if(sisa==13){
                                sb.append("D");
                            }
                            else if(sisa==14){
                                sb.append("E");
                            }
                            else if(sisa==15){
                                sb.append("F");
                            }
                            else{
                                sb.append(sisa);
                            }
                            i = (i/radix);
                            sb.append(" ");
                        }
                        else if(counter==awal+4){
                            int hasil = i/radix;
                            int sisa = i-(hasil*radix);
                            if(sisa==10){
                                sb.append("A");
                            }
                            else if(sisa==11){
                                sb.append("B");
                            }
                            else if(sisa==12){
                                sb.append("C");
                            }
                            else if(sisa==13){
                                sb.append("D");
                            }
                            else if(sisa==14){
                                sb.append("E");
                            }
                            else if(sisa==15){
                                sb.append("F");
                            }
                            else{
                                sb.append(sisa);
                            }
                            i = (i/radix);
                            sb.append(" ");
                            awal = awal+4;
                        }
                        else{
                            int hasil = i/radix;
                            int sisa = i-(hasil*radix);
                            if(sisa==10){
                                sb.append("A");
                            }
                            else if(sisa==11){
                                sb.append("B");
                            }
                            else if(sisa==12){
                                sb.append("C");
                            }
                            else if(sisa==13){
                                sb.append("D");
                            }
                            else if(sisa==14){
                                sb.append("E");
                            }
                            else if(sisa==15){
                                sb.append("F");
                            }
                            else{
                                sb.append(sisa);
                            }
                            i = (i/radix);
                        }
                        counter +=1;
                    }
                    else{
                        if (counter==awal){
                            sb.append("0");
                            i = (i/radix);
                            sb.append(" ");
                        }
                        else if(counter==awal+4){
                            sb.append("0");
                            i = (i/radix);
                            sb.append(" ");
                            awal = awal+4;
                        }
                        else{
                            sb.append("0");
                            i = (i/radix);
                        }
                        counter +=1;
                    }
                }
                else{
                    kondisi = false;
                }
            }
            sb.reverse();
        }
        return sb.toString();
    }
    public static String convertToBinary(int number){
        return coreConvertFromDecimal(number, 2);
    }
    public static String convertToHexa(int number){
        return coreConvertFromDecimal(number, 16);
    }
    public static String convertToOcta(int number){
        return coreConvertFromDecimal(number, 8);
    }
    public static int coreConvertToDecimal(String numberString, int radix){
        int num = Integer.parseInt(numberString, radix);
        return num;
    }
    public static int convertBinaryToDecimal(String number){
        return coreConvertToDecimal(number, 2);
    }
    public static int convertHexaToDecimal(String number){
        return coreConvertToDecimal(number, 16);
    }
}