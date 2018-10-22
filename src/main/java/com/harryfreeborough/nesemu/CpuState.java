package com.harryfreeborough.nesemu;

public class CpuState {
    
    //CPU Cycles that need to be catched up on by other devices
    //(i.e. PPU, APU and controller processor, WE it is called /TODO)
    public int cycles = 0;
    
    //16-bit program counter
    public int regPc = 0x600;
    
    //8-bit stack pointer
    public int regSp = 0xFF;
    
    //8-bit accumulator register
    public int regA = 0;
    
    //8-bit index registers
    public int regX = 0;
    public int regY = 0;
    
    //16-bit memory address reigster for internal use to make things easier
    //TODO: Kind of hacky, possibly change design of AddressingMode to avoid this
    //(previously calling read1 and write1 in one instruction would not work for
    // modes which pop from program memory)
    public int regMar;
    
    //Carry flag - Enables multi-byte arithmetic operations and indicates whether
    //the result of the previous operation on the accumulator register
    //overflowed from bit 7 or underflowed from bit 0.
    public boolean flagC = false;
    
    //Zero flag - Indicates whether the result of the previous operation
    //on the accumulator register was 0.
    public boolean flagZ = false;
    
    //Interrupt flag - Indicates whether interrupts are either prevented (false)
    //or enabled (true).
    public boolean flagI = true;
    
    //Decimal flag - Indicates whether BCD (binary coded decimal) mode is used
    //in arithmetic operations (true) or binary mode is used (false).
    public boolean flagD = false;
    
    //Break flag - Indicates whether a BRK instruction has been executed
    //and is being handled.
    public boolean flagB = false;
    
    
    //Unused flag
    public boolean flagU = true;
    
    //Overflow flag - Indicates whether the result of the previous operation
    //on the accumulator register was too large to fit in the register width
    //(less than -128 or more than 127 in the two's complement representation).
    public boolean flagV = false;
    
    public boolean flagN = false;
    
}
