package Command;

/**
 * Created by ekansrm on 11/13/16.
 * 命令接口
 */
public interface Command {
    void execute();
    void undo();
}
