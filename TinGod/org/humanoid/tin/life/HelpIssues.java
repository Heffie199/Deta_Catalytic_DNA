package org.humanoid.tin.life;

import java.util.concurrent.CopyOnWriteArrayList;

import org.humanoid.tin.analysis.HelpAnalysisIssues;
import org.humanoid.tin.management.HelpManagementIssues;
import org.humanoid.tin.operation.HelpOperationIssues;
import org.humanoid.tin.process.HelpProcessIssues;

public class HelpIssues{
	public void helpDefinition() {

	}
	public void helpImplementation() {

	}
	public void helpCombination() {

	}
	public void helpExtension() {

	}
	public void helpAckquisition() {

	}
	public void philosothon(CopyOnWriteArrayList<String> read) {
		//a
		new HelpAnalysisIssues().vpcsInitons();
		//o
		new HelpOperationIssues().vpcsInitons();
		//p
		new HelpProcessIssues().vpcsInitons();
		//m
		new HelpManagementIssues().vpcsInitons();
	}
}