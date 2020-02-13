# Notes
Architecture: MVVM Architecture

Database: Room

Language: Java

Things to use:
Data binding
RxJava
Schedulers

Features:

List:

This is just a container for the sub lists (This will not hold any tasks)

Have multiple list with unique names

Local search withing a list for any tasks


Sub List:

Recycler view layout with a fragment layout below it or see for more optimal way to do it.

Have a plus button to add more tasks in recycler view 


Add task:

Task Name

Notes

Sub Tasks

List of to do items

Due Date

Reminder (Month, Week, Day, Hour, Minutes)

Priority

Different color to make highlight

Time stamp of creation

Move task from one List to another


Recycler View Features:

Slide to delete

Move up and down any element

Delete selected rows

Undo option for deleted items (Snake bar or some thing like that)


delete:

Remove completed from UI

Remove completed from database

Delete a list


Sorting:

Sort By priority

Alphabetical (A-Z & Z-A)

Creation date (Inc & Dec)

Modified date (Inc & Dec)

Due Date (Inc & Dec)

Highlighted


Other Features:

Add area to quickly add a task

Global search for any task

Duplicate a list

Every list container has its own activity


Most important features:

Use the application without clicking (Google assistant, In-app audio recognition)

For the ones who want to contribute to this project:

Follow below link to read nameing conventions for branches, Coding Standards to follow
