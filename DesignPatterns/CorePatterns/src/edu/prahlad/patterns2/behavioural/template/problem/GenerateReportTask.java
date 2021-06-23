package edu.prahlad.patterns2.behavioural.template.problem;

public class GenerateReportTask {
    private AuditTrail auditTrail;

    public GenerateReportTask(AuditTrail auditTrail) {
        this.auditTrail = auditTrail;
    }

    public void execute(){
        auditTrail.record();

        System.out.println("Generate Report");
    }
}
