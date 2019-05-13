package org.humanoid.tin.dna.processor;
public class SwapLaw{
	public DNA swap(DNA original) {	
		original.setFunctionLineDeque(new CopyLaw().copy(original.getMaskLineDeque()));	
		original.setFunctionLineMap(new CopyLaw().copyMap(original.maskLineDeque));	
		original.setMaskLineMap(new CopyLaw().copyMap(original.functionLineDeque));	
		return original;
	}
}