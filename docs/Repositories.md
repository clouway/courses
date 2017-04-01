> IMPORTANT! Completed tasks are evaluate at the final result and the manner of applying the knowledge gained in the  course 

### Required reading
 * [GIT](http://book.git-scm.com/)  
 * [Write Commit Message](http://chris.beams.io/posts/git-commit/)  
 * [GitHub](http://github.com/)  
 * [Git from the inside out](http://maryrosecook.com/blog/post/git-from-the-inside-out)  
 * [Rewriting History - Interactive Rebase, Squash, Ammend](https://robots.thoughtbot.com/git-interactive-rebase-squash-amend-rewriting-history)  

### Video Tutorials
 * [GitHub Basic PR Workflow](https://drive.google.com/open?id=0B9XARH7wTEN4MHV2SG9TMXdOOUU)  

### Задачи  
  * Да се създаде проект с GIT
  * Да се направят промени и да се commit-нат
  * Да се създаде нов branch. Да се направят промени в него и след това branch-a да се слее (merge) с master'a
  * Да се направи rebase и merge с конфликти, които да се ресолвнат и да се определят разликите между 2'та подхода
  * Да се направи squash на няколко commit-a
  * Да се създаде tag
  * Да се изследва и установи каква е разликата между rebase и merge
  * Да се check out-не проекта на друго място
  * Да се определят разликите между централизирана и дистрибутирана система за управление на кода
  * Да се разгледат инструментите на GitHub за комуникация между разработчици (pull requests,issues, branches,tags, merging).

#### Tips

Setting vim as default editor
```
git config --global core.editor "vim"
```

Rewriting last commit 
```
git commit --amend
```

Example ~/.gitconfig 
```
[user]
        name = Developer Name
        email = developerxxx@gmail.com
[diff]
[color]
    ui = auto
[alias]
    st = status
    ci = commit
    co = checkout
    di = diff
    dc = diff --cached
    amend = commit --amend
    aa = add --all
    head = !git l -1
    h = !git head
    r = !git l -20
    ra = !git r --all
    ff = merge --ff-only
    pullff = pull --ff-only
    noff = merge --no-ff
    l = log --graph --abbrev-commit --date=relative
    la = !git l --all
    div = divergence
    gn = goodness
    gnc = goodness --cached
    fa = fetch --all
    pom = push origin master
    b = branch
    ds = diff --stat=160,120
    sync = !git fetch upstream && git rebase upstream/master
[format]
    pretty=format:%C(yellow)%h%Creset -%C(red)%d%Creset %s %Cgreen(%ar) %C(bold blue)<%an>%Creset

[merge]
    tool = vimdiff
[core]
        autocrlf = input
        excludesfile = /home/clouway/.gitignore_global
[http]
        cookiefile = /home/clouway/.gitcookies
[commit]
        template = /home/clouway/.gitmessage
```

#### Vi Tips

[VIM Adventures](http://vim-adventures.com/)
[VIM Master Basics](http://www.tuxradar.com/content/vim-master-basics)
[VIM CheatSheet](http://www.viemu.com/vi-vim-cheat-sheet.gif)  
```
vim test.txt -> edit file named test.txt
escape -> exists edit mode
i -> enters edit mode
escape + ":wq" -> write file and quit 
dd -> delete current line 
5dd -> delete next 5 lines 
```
