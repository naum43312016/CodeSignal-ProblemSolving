package asafov.com.SpaceXinterviewQuestions;

import java.util.Arrays;

public class CpuEmulator {
    static String cpuEmulator(String[] subroutine) {
        long[] registers = new long[43];
        long INT32 = (long)Math.pow(2,32);
        for (int i=0;i<subroutine.length;i++){
            String[] arr = subroutine[i].split(" ");
            String instruction = arr[0];
            if (instruction.equals("MOV")){//MOV
                String[] arrIns = arr[1].split(",");
                String val = arrIns[0];
                String destReg = arrIns[1];
                if (val.contains("R")){//copy reg to reg
                    int valReg = getIndex(val);
                    int destRegIndex = getIndex(destReg);
                    registers[destRegIndex]=registers[valReg];
                }else{//copy num to reg
                    long num = Long.valueOf(val);
                    int regIndex = getIndex(destReg);
                    registers[regIndex]=num;
                }
            }else if (instruction.equals("ADD")){//ADD
                String[] arrIns = arr[1].split(",");
                String val = arrIns[0];
                String destReg = arrIns[1];
                int valReg = getIndex(val);
                int destRegIndex = getIndex(destReg);
                double d =(registers[valReg]+registers[destRegIndex])%Math.pow(2,32);
                registers[valReg]=(long)d;
            }else if (instruction.equals("DEC")){//DEC
                int reg = getIndex(arr[1]);
                if (registers[reg]==0){
                    registers[reg]=INT32-1;
                }else {
                    registers[reg] = registers[reg]-1;
                }
            }else if (instruction.equals("INC")){//INC
                int reg = getIndex(arr[1]);
                if (registers[reg]==INT32-1){
                    registers[reg] = 0;
                }else {
                    registers[reg] = registers[reg]+1;
                }
            }else if (instruction.equals("INV")){//INV
                int reg = getIndex(arr[1]);
                registers[reg]=~registers[reg]+INT32;
            }else if (instruction.equals("JMP")){
                int index = Integer.valueOf(arr[1]);
                i=index-2;
            }else if (instruction.equals("JZ")){
                if (registers[0]==0){
                    int index = Integer.valueOf(arr[1]);
                    i=index-2;
                }
            }
        }
        return String.valueOf(registers[42]);
    }

    public static int getIndex(String str){
        String RegN = str.charAt(1)+""+str.charAt(2);
        int r = Integer.valueOf(RegN);
        return r;
    }
    public static void main(String[] args) {
        String[] s = {
                "MOV 32,R00",
                "MOV 1,R41",
                "JZ 8",
                "MOV R41,R42",
                "ADD R41,R42",
                "DEC R00",
                "JMP 3",
                "NOP"

        };
        System.out.println(cpuEmulator(s));
    }
}
