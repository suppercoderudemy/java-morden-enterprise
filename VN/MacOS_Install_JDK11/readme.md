- Update homebrew

``$brew update``

 ``$brew tap homebrew/cask-version``

- List all installed version JDK in your machine

``ls -a /Library/Java/JavaVirtualMachines``

- If not found JDK11, intall it

``brew install adoptopenjdk/openjdk/adoptopenjdk11``

- Check version after install

``java --version``