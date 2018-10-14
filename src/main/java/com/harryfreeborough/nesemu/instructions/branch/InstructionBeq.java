package com.harryfreeborough.nesemu.instructions.branch;

import com.harryfreeborough.nesemu.MemoryBus;
import com.harryfreeborough.nesemu.CpuState;
import com.harryfreeborough.nesemu.addressing.InstructionMode;
import com.harryfreeborough.nesemu.instructions.Instruction;
import com.harryfreeborough.nesemu.utils.MemoryUtils;

public class InstructionBeq implements Instruction {

    @Override
    public int[] getOpCodes() {
        return new int[]{ 0xF0 };
    }

    @Override
    public boolean obtainMode() {
        return false;
    }

    @Override
    public void execute(int opCode, InstructionMode mode, MemoryBus bus, CpuState store) {
        if (store.flagZ) {
            store.regPc += MemoryUtils.programPop1(bus, store);
        }
    }

}
