package designpatterns.command.text.commands;

import designpatterns.command.text.receiver.Editor;
import designpatterns.command.text.caller.Application;

public abstract class Command {
    protected Application app;
    protected Editor editor;
    protected String backup;

    public Command(Application app, Editor editor) {
        this.app = app;
        this.editor = editor;
    }

    public void saveBackup() {
        this.backup = editor.text;
    }

    public void undo() {
        this.editor.text = backup;
    }

    public abstract void execute();
}
