var obsidian = require('obsidian');

class MyPlugin extends obsidian.Plugin {
    onload() {
        new obsidian.Notice('This is a notice!');
    }
}

module.exports = MyPlugin;
