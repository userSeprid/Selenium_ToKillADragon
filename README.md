#QA Automation

This test open several pages in Wikipedia and check if an actor in his filmography had role in film "To kill a dragon"

Possible bug remark:
- Due the fact that on corresponding pages web elements that contain required information don't have any unique pointers (ID, class name, etc.) - one precarious option was used.
To find a required element I used a method that looking for element by "partial link text". In case if actor didn't had a role in film but on his page link to film present - test will pass but I didn't find an alternative so use this trick way.
