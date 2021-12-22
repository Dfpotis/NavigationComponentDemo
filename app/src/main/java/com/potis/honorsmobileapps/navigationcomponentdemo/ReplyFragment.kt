package com.potis.honorsmobileapps.navigationcomponentdemo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.potis.honorsmobileapps.navigationcomponentdemo.databinding.FragmentReplyBinding
import com.potis.honorsmobileapps.navigationcomponentdemo.databinding.FragmentSendMessageBinding

class ReplyFragment : Fragment() {
    private var _binding: FragmentReplyBinding? =null
    private val binding get()= _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding= FragmentReplyBinding.inflate(inflater,container,false)
        val rootView =binding.root
        binding.sendReplyButton.setOnClickListener{

        }
        return rootView
    }
    override fun onDestroyView(){
        super.onDestroyView()
        _binding =null
    }
}