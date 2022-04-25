# ToDoList
## My First To Do List application
<p align="center"><img  src="https://user-images.githubusercontent.com/71185943/165082485-5670e383-49c1-44fe-9e5f-a87d699e5133.png"> </p>

## Usage 
```Groovy
plugins {
    ...
    id 'kotlin-android-extensions'
}
```
Created by ```ListView```

```xml
<ListView
        android:id="@+id/listView"
        android:layout_width="wrap_content"
        android:layout_height="match_parent"
        android:layout_below="@+id/textView1"
        android:fontFamily="@font/myfonts"
        android:choiceMode="multipleChoice" />
```

### Adding 
```add``` add button
```Kotlin
add.setOnClickListener {
            itemList.add(editText.text.toString())
            listView.adapter = adapter
            adapter.notifyDataSetChanged()
            editText.text.clear()
        }
```
### Deleting
```delete``` delete button
```kotlin
delete.setOnClickListener {
            val position: SparseBooleanArray = listView.checkedItemPositions
            val count = listView.count
            var item = count - 1
            while (item >= 0) {
                if (position.get(item)) {
                    adapter.remove(itemList.get(item))
                }
                item--
            }
            position.clear()
            adapter.notifyDataSetChanged()
        }
```
### Clear
```clear``` clear button
```Kotlin
clear.setOnClickListener {
            itemList.clear()
            adapter.notifyDataSetChanged()
        }

```
