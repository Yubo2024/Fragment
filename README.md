项目名称：欢迎信息与上传按钮交互小项目
项目目标：
使用 Fragment 实现用户输入信息展示 + 动态按钮显示 + 上传成功提示。
关键代码片段一：Fragment 创建与数据接收
companion object {
    fun newInstance(name: String, age: String): MyFragment {
        val fragment = MyFragment()
        val args = Bundle()
        args.putString("name", name)
        args.putString("age", age)
        fragment.arguments = args
        return fragment
    }
}
这个是 Fragment 的“工厂方法”，通过 Bundle 传递姓名和年龄参数，避免直接操作构造器。调用 MyFragment.newInstance("张三", "18") 就能打包数据带过去啦。

关键代码片段二：Fragment 内部视图绑定与逻辑交互
val textView = view.findViewById<TextView>(R.id.textViewInfo)
val buttonShowUpload = view.findViewById<Button>(R.id.buttonShowUpload)
val buttonUploadSuccess = view.findViewById<Button>(R.id.buttonUploadSuccess)
buttonShowUpload.setOnClickListener {
    textView.text = "您好！$name，您的年龄是 $age"
    buttonUploadSuccess.visibility = View.VISIBLE
}
buttonUploadSuccess.setOnClickListener {
    Toast.makeText(requireContext(), "上传成功！", Toast.LENGTH_SHORT).show()
}
第一部分是控件绑定，抓住布局里的 TextView 和两个按钮。
点击“上传”按钮后，动态设置欢迎语，并显示“上传成功”按钮。
第二个按钮点击后显示 Toast（小弹窗）提示用户上传成功。

总结：
今天的项目围绕 Fragment 展开，重点掌握了以下知识点：
1.如何通过 Bundle 向 Fragment 传递参数；
2.在 Fragment 中如何动态更新 UI 和响应按钮事件；
3.使用 Toast 进行用户提示；
4.熟悉 Fragment 生命周期和 onCreateView() 中的视图处理。

这个小项目是 Fragment 入门非常棒的练习，逻辑清晰、功能实用，而且为后续的页面跳转、数据展示打下了坚实的基础！
