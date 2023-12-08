
package thuattoan;


public class Row
{
    private String processName;
    private int arrivalTime;
    private int burstTime;
    private int priorityLevel;
    private int waitingTime;
    private int turnaroundTime;
    private int completionTime;
    private Row(String processName, int arrivalTime, int burstTime, int priorityLevel, int waitingTime, int turnaroundTime, int completionTime)
    {
        this.processName = processName;
        this.arrivalTime = arrivalTime;
        this.burstTime = burstTime;
        this.priorityLevel = priorityLevel;
        this.waitingTime = waitingTime;
        this.turnaroundTime = turnaroundTime;
        this.completionTime = completionTime;
    }
    
    public Row(String processName, int arrivalTime, int burstTime, int priorityLevel)
    {
        this(processName, arrivalTime, burstTime, priorityLevel, 0, 0,0);
    }
    
    public Row(String processName, int arrivalTime, int burstTime)
    {
        this(processName, arrivalTime, burstTime, 0, 0, 0,0);
    }
    
    public void setBurstTime(int burstTime)
    {
        this.burstTime = burstTime;
    }
    
    public void setWaitingTime(int waitingTime)
    {
        this.waitingTime = waitingTime;
    }
    
    public void setTurnaroundTime(int turnaroundTime)
    {
        this.turnaroundTime = turnaroundTime;
    }
    
    public void setCompletionTime(int completionTime) {
    	this.completionTime = completionTime;
    }
    
    public String getProcessName()
    {
        return this.processName;
    }
    
    public int getArrivalTime()
    {
        return this.arrivalTime;
    }
    
    public int getBurstTime()
    {
        return this.burstTime;
    }
    
    public int getPriorityLevel()
    {
        return this.priorityLevel;
    }
    
    public int getWaitingTime()
    {
        return this.waitingTime;
    }
    
    public int getTurnaroundTime()
    {
        return this.turnaroundTime;
    }

	public Object getCompletionTime() {
		return this.completionTime;
	}

    @Override
    public String toString() {
        return "Row{" + "processName=" + processName + ", arrivalTime=" + arrivalTime + ", burstTime=" + burstTime + ", priorityLevel=" + priorityLevel + ", waitingTime=" + waitingTime + ", turnaroundTime=" + turnaroundTime + ", completionTime=" + completionTime + '}';
    }
       
}
