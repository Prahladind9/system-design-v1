package edu.prahlad.patterns2.behavioural.template.soln;

public abstract class Task {
    private AuditTrail auditTrail;

    public Task(){
        auditTrail = new AuditTrail();
    }

    //Will help in injecting interface-implementation during runtime
    public Task(AuditTrail auditTrail) {
        this.auditTrail = auditTrail;
    }

    public void execute(){
        auditTrail.record();
        doExecute();
    }

    protected abstract void doExecute();
}
